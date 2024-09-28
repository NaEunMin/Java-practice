import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MonsterGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 전투 통계 데이터
		int totalMonsterDamage = 0;
		int totalPlayterDamage = 0;
		// 플레이어와 몬스터 설정
		int playerHP = 100;
		int numberOfMonsters = 2; // 몬스터 2마리
		int[] monsterHPs = new int[numberOfMonsters]; // 몬스터들 체력 저장 배열

		// 각 몬스터의 체력을 50~100 사이에서 랜덤하게 설정
		for (int i = 0; i < numberOfMonsters; i++) {
			monsterHPs[i] = random.nextInt(51) + 50; // 50 ~ 100 사이의 체력
		}
		// 각 몬스터의 공격력을 5~15 사이에서 설정
		int monsterDamage[] = new int[numberOfMonsters];
		for (int i = 0; i < numberOfMonsters; i++) {
			monsterDamage[i] = random.nextInt(11) + 5;
		}
		int healingValue[] = { 10, 20, 30 };
		// 사용자로부터 힐링 아이템 개수를 입력받기
		/*
		 * int healingItems = 0; do { System.out.print("\n회복 아이템의 개수를 입력하세요: "); try {
		 * healingItems = scanner.nextInt(); // 사용자 입력받기 if (healingItems < 0) {
		 * System.out.println("회복 아이템 개수는 0개 이상으로 입력해주세요"); } } catch
		 * (InputMismatchException e) { System.out.println("잘못된 입력입니다. 양수를 입력해주세요");
		 * scanner.nextLine(); healingItems = -1; } scanner.nextLine(); // 입력 버퍼 정리 }
		 * while (healingItems < 0);
		 */
		int healingItems = 0;
		while (true) {
			System.out.println("사용할 회복 아이템의 개수를 입력하시오 >>");
			try {
				healingItems = scanner.nextInt();
				if (healingItems >= 0)
					break;
				if (healingItems < 0) {
					System.out.println("회복 아이템의 개수는 0개 이상으로 입력하시오.");
				}
			} catch (InputMismatchException e) {
				System.out.println("회복 아이템 개수는 0개 이상으로 입력하시오.");
			}
		}

		// 전투 시작 안내 메시지
		System.out.println("\n==================== 전투 시작 ====================");
		System.out.println("당신의 체력: " + playerHP);
		System.out.println("회복 아이템: " + healingItems + "개");
		System.out.println("==================================================");

		// 게임 진행
		for (

				int i = 0; i < numberOfMonsters; i++) {
			System.out.println("현재 몬스터 #" + (i + 1) + "과 싸우고 있습니다!");

			// 현재 몬스터와 싸움
			while (monsterHPs[i] > 0 && playerHP > 0) {
				System.out.println("\n현재 몬스터 #" + (i + 1) + "의 체력: " + monsterHPs[i]);
				System.out.println("당신의 체력: " + playerHP);
				System.out.println("==================================================");
				System.out.print("\n공격하려면 'a'를 입력! 종료하려면 'q' 입력! 회복하려면 'h' 입력!\n\n> ");
				String action = scanner.nextLine();

				if (action.equals("a")) {
					// 플레이어의 공격
					int playerAttack = random.nextInt(11) + 10; // 10 ~ 20의 데미지
					monsterHPs[i] -= playerAttack;
					totalPlayterDamage += playerAttack; // 전투 통계 수집
					System.out.println("\n==================================================");
					System.out.println("당신이 몬스터 #" + (i + 1) + "에게 " + playerAttack + "의 데미지를 입혔습니다!");

					// 몬스터의 공격
					if (monsterHPs[i] > 0) {
						playerHP -= monsterDamage[i];
						totalMonsterDamage += monsterDamage[i]; // 전투 통계 수집
						System.out.println("몬스터 #" + (i + 1) + "이 당신에게 " + monsterDamage[i] + "의 데미지를 입혔습니다!");
					} else {
						System.out.println("몬스터 #" + (i + 1) + "을 퇴치했습니다!");
					}
				} else if (action.equals("h")) {
					// 플레이어가 회복 아이템을 사용
					if (healingItems > 0) {
						int randomHealValue = healingValue[random.nextInt(healingValue.length)];
						playerHP += randomHealValue; // 랜덤으로 힐량을 받아와서 플레이어 체력을 회복시킨다.
						healingItems--; // 아이템 소모
						System.out.println("\n당신은 체력을" + randomHealValue + " 회복했습니다! 남은 체력: " + playerHP);
						System.out.println("남은 회복 아이템: " + healingItems + "개");
					} else {
						System.out.println("\n회복 아이템이 없습니다!");
					}
				} else if (action.equals("q")) {
					System.out.println("\n게임을 종료합니다.");
					scanner.close();
					return;
				} else {
					System.out.println("\n잘못된 입력입니다. 다시 입력하세요.");
				}
			}

			// 게임 종료 조건: 플레이어 HP가 0 이하일 경우 패배
			if (playerHP <= 0) {
				System.out.println("\n당신의 체력이 모두 소진되었습니다. 패배했습니다.");
				System.out.println("남은 몬스터 체력 : " + monsterHPs[i]);
				System.out.println("총 플레이어가 넣은 데미지 >>" + totalPlayterDamage);
				System.out.println("총 플레이어가 받은 데미지 >>" + totalMonsterDamage);
				scanner.close();
				return;
			}
		}

		// 모든 몬스터를 퇴치했을 경우 승리
		if (playerHP > 0) {
			System.out.println("\n축하합니다! 모든 몬스터를 물리쳤습니다. 승리!");
			System.out.println("전투 통계");
			System.out.println("총 플레이어가 넣은 데미지 >>" + totalPlayterDamage);
			System.out.println("총 플레이어가 받은 데미지 >>" + totalMonsterDamage);
			System.out.println("남은 회복 아이템 개수 >>" + healingItems);
			System.out.println("각 몬스터의 공격력");
			for (int i = 0; i < numberOfMonsters; i++) {
				System.out.println("몬스터 " + (i + 1) + "의 공격력 " + monsterDamage[i]);
			}
		}

		System.out.println("==================================================");
		scanner.close();
	}
}
