


import java.util.Scanner;


class Post {                                              // parrent class post 

//long comments_c;
int comments_c;
String[] comments;


Post() {

	this.comments_c = 0;
	this.comments = new String[1024];
//	this.hashtags = new String[1024];
	this.post();

}

void post() {
	System.out.println(" new post ");
}

void comment() {

	Scanner sc = new Scanner(System.in);
	System.out.println(" commenting on post : "  );
	String new_comment = sc.nextLine();

	this.comments[this.comments_c] = new_comment;
        this.comments_c = this.comments_c + 1 ;	

}


void comment_count () {

	System.out.println(" comments on this blog / image / video  post : " + this.comments_c );

}

void display_comments () {

	System.out.println(" comments on this blog / image / video post : ");
	int x = 0;
while(x != this.comments_c ) {
System.out.println(" " + x + ". " + comments[x] );
	x++;
}

}


}

class Blog_post extends Post {

void post() {                                                                      // over riding post 
	System.out.println(" new blog post ");
}

void comment() {                                                                             // over ridding comment 

	Scanner sc = new Scanner(System.in);
	System.out.println(" commenting on blog post : "  );
	String new_comment = sc.nextLine();

	this.comments[this.comments_c] = new_comment;
        this.comments_c = this.comments_c + 1 ;	

}


}


class Image_post extends Post {

void post() {                                                                                                   // over ridding post 
	System.out.println(" new image post ");
}

void comment() {                                                                                                        // over ridding comment 

	Scanner sc = new Scanner(System.in);
	System.out.println(" commenting on image post : "  );
	String new_comment = sc.nextLine();

	this.comments[this.comments_c] = new_comment;
        this.comments_c = this.comments_c + 1 ;	

}
}


class Video_post extends Post {

void post() {                                                                                                               // over ridding post 
	System.out.println(" new video post ");
}

void comment() {                                                                                                                               // over ridding comment 

	Scanner sc = new Scanner(System.in);
	System.out.println(" commenting on video post : "  );
	String new_comment = sc.nextLine();

	this.comments[this.comments_c] = new_comment;
        this.comments_c = this.comments_c + 1 ;	

}

}



public class Assi4_b {


public static void main() {

int x = 0;
Post[] p = new Post[1024];
int post = 0;

Scanner sc = new Scanner(System.in);
do {

System.out.println( "  _______________________________________________\n |                                               |\n |                   Menu                        |\n |_______________________________________________|\n\n 1. add blog post \n 2. add image post \n 3. add video post \n 4. add comment \n 5. see comments count \n 6. see comments  \n 7. exit.............\n\n");

System.out.println(" enter your choice : ");
x = sc.nextInt();

switch(x ) {

case 1: {
		Post new_post = new Blog_post();
		p[post]= new_post;
		post = post + 1 ;
	};
	break;

case 2: {
		Post new_post = new Image_post();
		p[post]= new_post;
		post = post + 1 ;
	};
	break;

case 3: {

		Post new_post = new Video_post();
		p[post]= new_post;
		post = post + 1 ;
	};
	break;

case 4: {
		int y = 0;
		System.out.println(" enter index of post to comment : ");
		y = sc.nextInt();
		p[y].comment();
	};
	break;

case 5: {
		int y = 0;
		System.out.println(" enter index of post to see comment count  : ");
		y = sc.nextInt();
		p[y].comment_count();
	};
	break;

case 6: {
		int y = 0;
		System.out.println(" enter index of post to see comments : ");
		y = sc.nextInt();
		p[y].display_comments();
	};
	break;

case 7: {
		System.out.println(" exittiinnnngggggggggggggg...................... \n\n");

	};
	break;
default :{

		System.out.println(" invalid                   \n\n");

	};
	break;
}


}while(x != 7);




}



}


/*            ************ output **************


rituja@rituja-Swift-SFG14-71:~/all/java$ java Assi4_b 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
1
 new blog post 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
2
 new image post 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
3
 new video post 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
3
 new video post 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
4
 enter index of post to comment : 
2   
 commenting on video post : 
comment 1 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
4
 enter index of post to comment : 
2
 commenting on video post : 
comment 2 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
5
 enter index of post to see comment count  : 
1
 comments on this blog / image / video  post : 0
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
5
 enter index of post to see comment count  : 
2
 comments on this blog / image / video  post : 2
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
6
 enter index of post to see comments : 
2
 comments on this blog / image / video post : 
 0. comment 1 
 1. comment 2 
  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
890987
 invalid                   


  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
9
 invalid                   


  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
0
 invalid                   


  _______________________________________________
 |                                               |
 |                   Menu                        |
 |_______________________________________________|

 1. add blog post 
 2. add image post 
 3. add video post 
 4. add comment 
 5. see comments count 
 6. see comments  
 7. exit.............


 enter your choice : 
7
 exittiinnnngggggggggggggg...................... 


rituja@rituja-Swift-SFG14-71:~/all/java$ 







*/ 
