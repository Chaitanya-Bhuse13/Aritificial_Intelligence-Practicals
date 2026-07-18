package ai_pract;

import java.util.Scanner;

public class ElementaryChatbot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Admission Assistant !");
		System.out.println("Type 'exit' anytime to end the conversation.\n");
		
		while(true) {
			System.out.println("You: ");
			String input = sc.nextLine().toLowerCase();
			
			if(input.contains("exit") || input.contains("bye") || input.contains("thanks")) {
				System.out.println("Edubot: Thank you for your Interest!");
				break;
			}else if(input.contains("courses") || input.contains("program") || input.contains("offer")) {
				System.out.println("Edubot: You can apply online through our official website. The process include Registration, document upload and payment");
			}else if(input.contains("admission") || input.contains("process") || input.contains("appply")) {
				System.out.println("Edubot: You can search in our website");
			}else if(input.contains("contact") || input.contains("phone") || input.contains("email")) {
				System.out.println("Edubot: You can contact us at '+918459455132' or mail us directly on 'mmcoe@gmail.com'");
			}else {
				System.out.println("Edubot: I am sorry, I am unable to understand what you are saying. Can you tell again");
			}
		}

	}

}
