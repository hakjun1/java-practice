package lang.immuateable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A,회원B의 처음 주소는 모두 서울
        System.out.println("memberA=" + memberA);//toString반영
        System.out.println("memberB=" + memberB);

//        memberB.getAddress().setValue("부산");//컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));//address가 불변 b가불변이아니라
        System.out.println("부산 -> mbmberB.address");
        System.out.println("mbmberA=" + memberA);
        System.out.println("memberB=" + memberB);

    }
}
