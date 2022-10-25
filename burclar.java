import java.util.Scanner;
public class burclar {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int dogumgun, dogumay;

        System.out.print("Doğduğunuz ay: ");
        dogumay = girdi.nextInt();

        System.out.print("Doğduğunuz gün: ");
        dogumgun = girdi.nextInt();

        if ((dogumay==3)){
            if (dogumgun>=21){
                System.out.println("Burcunuz: Koç");}
            else {
                System.out.println("Burcunuz: Balık");}}

        if ((dogumay==4)){
            if (dogumgun>=21){
            System.out.println("Burcunuz: Boğa");}
        else {
            System.out.println("Burcunuz: Koç");}}

        if ((dogumay==5)){
            if (dogumgun>=22){
                System.out.println("Burcunuz: İkizler");}
            else {
                System.out.println("Burcunuz: Boğa");}}

        if ((dogumay==6)){
            if (dogumgun>=23){
                System.out.println("Burcunuz: Yengeç");}
            else {
                System.out.println("Burcunuz: İkizler");}}

        if ((dogumay==7)){
            if (dogumgun>=23){
                System.out.println("Burcunuz: Aslan");}
            else {
                System.out.println("Burcunuz: Yengeç");}}

        if ((dogumay==8)){
            if (dogumgun>=23){
                System.out.println("Burcunuz: Başak");}
            else {
                System.out.println("Burcunuz: Aslan");}}

        if ((dogumay==9)){
            if (dogumgun>=23){
                System.out.println("Burcunuz: Terazi");}
            else {
                System.out.println("Burcunuz: Başak");}}

        if ((dogumay==10)){
            if (dogumgun>=23){
                System.out.println("Burcunuz: Akrep");}
            else {
                System.out.println("Burcunuz: Terazi");}}

        if ((dogumay==11)){
            if (dogumgun>=22){
                System.out.println("Burcunuz: Yay");}
            else {
                System.out.println("Burcunuz: Akrep");}}

        if ((dogumay==12)){
            if (dogumgun>=22){
                System.out.println("Burcunuz: Oğlak");}
            else {
                System.out.println("Burcunuz: Yay");}}

        if ((dogumay==1)){
            if (dogumgun>=22){
                System.out.println("Burcunuz: Kova");}
            else {
                System.out.println("Burcunuz: Oğlak");}}

        if ((dogumay==2)){
            if (dogumgun>=20){
                System.out.println("Burcunuz: Balık");}
            else {
                System.out.println("Burcunuz: Kova");}}





    }}

