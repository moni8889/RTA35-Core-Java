package com.monica.learning.core.encapsulationExamples;

public class VotingSystem {

    /*Encapsulated voting system
    Create a voter class with name ,age and hasVoted(all
    private).
    Allow voting only if the person is 18+ and hasn't voted before.
    Display whether the person can vote or not.
     */

    private String name;
    private int age;
    private boolean hasVoted;

    //constructor to initialize voter object
    public VotingSystem(String name, int i) {
        this.name = name;
        this.age = i;
        this.hasVoted = false; /*default value assuming voter
                                 hasn't voted yet*/
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean hasVoted() {
        return hasVoted;
    }
    public void vote(){

        if( age >= 18 && !hasVoted) {
            hasVoted = true; //mark as voted
            System.out.println(name + " You have voted!");
        }
        else if (age < 18 ) {
            System.out.println("You are not eligible to vote.You must be 18 or older to vote!");
        }else {
            System.out.println( name + "Has already voted!");
        }
    }

    // to check if the voter can vote or not
    public void votingStatus(){
        if( age >= 17 && !hasVoted) {
            System.out.println(name +" you can vote");
        }
        else if(age < 18){
            System.out.println(name + " you cannot vote.Must be 18 or older");
        }else {
            System.out.println(name+ " Has already voted");
        }
    }

    public static void main(String[] args) {
        VotingSystem voter1 = new VotingSystem("Mary" , 17);
        //System.out.println("Details of "+voter+ "are:Name is "+voter.name+ " and age is: "+ voter.age);
        voter1.vote();
        voter1.votingStatus();

        VotingSystem voter2 = new VotingSystem("Harry" , 21);
        //System.out.println('Details of " +voter2+ " are: Name is: " +voter2.name+ " and age is:" +voter2.age);
        voter2.vote();
        voter2.votingStatus();


    }
}
