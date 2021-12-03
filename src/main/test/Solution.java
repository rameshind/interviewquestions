package main.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


class Solution {
    public  int run() {
      int i = 10;
      try
      {
          i=i/0;
          return i;

      }catch (Exception e){
          i=20;
          return i;
      }
      finally {
          i=30;
          return i;
      }
    }



    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////





    public static void main(String[] args) {

      List<String> l1=  Arrays.asList(  "03cc2685-025d-4c50-80ab-069b93abf453",
                "0ae83b35-e4b6-47a5-bb0c-a7dc0db4e68f",
                "19881ab1-bce7-4104-9b0b-026b0cc9c515",
                "2be59ec8-28d8-415f-af5a-a8bae2f4a799",
                "30bb4750-ee23-42bf-9513-ba41c137210e",
                "573426e1-4a55-4b09-9cbb-a55aebebdaa4",
                "69475c7b-f59c-494a-b61e-2e83c0276156",
                "6975e044-4f25-4bc5-ad53-3f1d033ff795",
                "7624cb6b-97db-4a12-9319-e53b5acf3521",
                "7a2762b8-90a4-4a91-9341-7ea5f5cd40f5",
                "8445d5fb-8047-4771-918d-3f45643928a8",
                "8d1e249b-8981-4964-b99c-772773dd2763",
                "8e329b43-302d-4033-812b-3cf0d9359909",
                "8f66ae13-7e5f-40fe-ac53-50f5aab619e8",
                "956873fd-f3b6-40e4-8de6-f4c1dace66da",
                "a0c59929-3f6e-4c13-be2f-e256453e0662",
                "a359293d-09b7-42ad-8eff-a1c0e4f8e902",
                "b462f8ca-ce7a-4490-a7e1-327e19a4f4c8",
                "b98d9254-e1a8-4eb7-8695-16d037d5736a",
                "bbfffefb-491b-40ff-9c96-c8ebe7efa3d2",
                "bf69f2f6-f2ed-41a9-b677-59177d033109",
                "c3a2b285-db7e-4ab0-8bfc-b3d27dbfe65f",
                "ce980a51-eb99-4cd3-aa87-0d12e8a31dbe",
                "d72bcca1-65bd-4f51-92f3-85c5a96caf85",
                "d96baf9f-fc64-4376-a01b-ebf05fa195c8",
                "dd1fdb78-0aa6-4ae7-849b-ba6706ba9f82",
                "e79b8e44-31bd-40ba-98f7-097735a28994",
                "f06b296f-48e6-4607-9a7d-020f18980747");


      List<String> l2= Arrays.asList("54831e36-0c0b-4e36-acd7-65ea28e7a3c8",
              "956873fd-f3b6-40e4-8de6-f4c1dace66da",
              "6975e044-4f25-4bc5-ad53-3f1d033ff795",
              "d72bcca1-65bd-4f51-92f3-85c5a96caf85",
              "7624cb6b-97db-4a12-9319-e53b5acf3521",
              "b462f8ca-ce7a-4490-a7e1-327e19a4f4c8",
              "b98d9254-e1a8-4eb7-8695-16d037d5736a",
              "2be59ec8-28d8-415f-af5a-a8bae2f4a799",
              "573426e1-4a55-4b09-9cbb-a55aebebdaa4",
              "c3a2b285-db7e-4ab0-8bfc-b3d27dbfe65f",
              "bf69f2f6-f2ed-41a9-b677-59177d033109",
              "d96baf9f-fc64-4376-a01b-ebf05fa195c8",
              "ce980a51-eb99-4cd3-aa87-0d12e8a31dbe",
              "0ae83b35-e4b6-47a5-bb0c-a7dc0db4e68f",
              "69475c7b-f59c-494a-b61e-2e83c0276156",
              "03cc2685-025d-4c50-80ab-069b93abf453",
              "8e329b43-302d-4033-812b-3cf0d9359909",
              "e79b8e44-31bd-40ba-98f7-097735a28994",
              "19881ab1-bce7-4104-9b0b-026b0cc9c515",
              "a0c59929-3f6e-4c13-be2f-e256453e0662",
              "8f66ae13-7e5f-40fe-ac53-50f5aab619e8",
              "8445d5fb-8047-4771-918d-3f45643928a8",
              "8d1e249b-8981-4964-b99c-772773dd2763",
              "4968dfa6-9cd8-4c00-bb26-2f5e37a7d23b",
              "a359293d-09b7-42ad-8eff-a1c0e4f8e902",
              "30bb4750-ee23-42bf-9513-ba41c137210e",
              "dd1fdb78-0aa6-4ae7-849b-ba6706ba9f82",
              "f06b296f-48e6-4607-9a7d-020f18980747",
              "bbfffefb-491b-40ff-9c96-c8ebe7efa3d2",
              "7a2762b8-90a4-4a91-9341-7ea5f5cd40f5");

        System.out.println(l2.stream().filter(ll-> !l1.contains(ll)).collect(Collectors.joining(",")));
        int sum =0;
for(int i=0;i<100;i++)
       sum+=i;
        System.out.println(sum);


      Solution a = new Solution();

      TreeSet<String> ts = new TreeSet();
      ts.add("acd");
      ts.add("aaa");
        ts.add("bas");
        ts.add("cac");
        ts.add("acd");
        System.out.println(ts.floor("abc"));
        System.out.println(ts.ceiling("aca"));
        System.out.println(ts.higher("aab"));

        ConcurrentHashMap chm = new ConcurrentHashMap();
        //chm.se

        //t2.start();

       // System.out.println(str);

    }

    private void addMinutesToDate(int minutes, Date beforeTime){
int a =0;
a= 7+a;
        System.out.println(a);
       /* final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs

        long curTimeInMs = beforeTime.getTime();
        Date afterAddingMins = new Date(curTimeInMs + (minutes * ONE_MINUTE_IN_MILLIS));
        return afterAddingMins;*/
        return;
    }

}
