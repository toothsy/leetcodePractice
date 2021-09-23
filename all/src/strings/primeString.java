//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class primeString {

        static boolean[] primes;

        public static void main(String[] args ) throws Exception {


//            BufferedReader br = new BufferedReader(new InputStreamReader());
//            String test = br.readLine();                // Reading input from STDIN
//            int t = Integer.parseInt(test);
            int t = 10;
            primes = new boolean[(int)1e5+1];
            for(int i = 3;i<primes.length;i+=2){
                primes[i] = true;
            }
            primes[2] = true;

            for(int i = 3;i<primes.length;i+=2){
                if(primes[i])
                    for(long j = (long)i*i;j<primes.length;j+=i)
                        primes[(int)j] = false;
            }

            String[] q = "eeeeeaaaaarrrrruuuuuzzzzzfffffdddddjjjjjxxxxxssssscccccvvvvvtttttnnnnnoooookkkkkgggggpppppwwwwwlllll\nhhhhhhhhhhhhhhhhhpppppppppppppppppqqqqqqqqqqqqqqqqqlllllllllllllllllvvvvvvvvvvvvvvvvvfffffffooooooo\nbbjjwwyyttdduuaaeemmffnnllppxxzzrriigghhvvssqqccookk\nvvvvvvvvvvvvvvvvvvvvvvvrrrrrrrrrrrrrrrrrrrrrrrxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaazzzgggww\nbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbrrrrrrruuuuuuuqqqqqqqkkkkkkksssssssvvv\nbbggiiqqaayyeeooddhhjjzzuuvvnnppwwffrrssmmllxxcckktt\neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeyyyyyyyttss\nkkmmnnaaffssvvttwweexxlljjuuhhccyyzzddbbrrggppqqooii\nmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxccoott\ndddddddddddddddddddddddddddddyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeeeeeeeeeeeeeeeeeeeeeeeeeeeeezzzqqqssswww\n".split("\n");

            while(t>0){
                String str = q[--t];
                System.out.println(isPrimeStr(str)?"YES":"NO");

            }
        }

    /**
     *
     *       A string is a primeString
     *       if the number of distinct alphabets used in the string is a prime
     *       and also the number of occurrences of each alphabet in the string
     *       is also a prime.
     * @param str input string
     * @returns if the given string is prime or not
     *
     *
     *
     */
    static boolean isPrimeStr(String str) {
            int[] arr = new int[26];
            StringBuilder sb = new StringBuilder(str);
            int distinct = 0;
            for(int i = 0 ;i<sb.length();i++){
                if(arr[sb.charAt(i)-'a']==0) distinct++;
                arr[sb.charAt(i)-'a']++;
            }
            if(!primes[distinct]) return false;
            for(int i = 0;i<26;i++){
                if(arr[i]!=0){
                    if(!primes[arr[i]])
                        return false;
                }

            }
            return true;
        }

}

