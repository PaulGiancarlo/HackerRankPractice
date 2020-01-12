import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.LongStream;


public class RepeatedString {

    static long repeatedString(String s, long n) {
    long r = 0;
// String temp = String.join("", Collections.nCopies((int)n, s));
System.out.println(n%s.length());
long mod = n%s.length();
long nroRep = n/s.length();
String temp = LongStream.range(0, mod).parallel().mapToObj(i -> s).collect(Collectors.joining(""));
if(s.equals("a"))
        return n;
r= temp.chars().parallel()
.mapToObj(item -> (char) item)
.collect(Collectors.toList()).stream().limit(mod).filter(i->i.equals('a')).count() + s.chars().parallel()
.mapToObj(item -> (char) item)
.collect(Collectors.toList()).stream().filter(i->i.equals('a')).count()*nroRep;
// System.out.println(temp.chars()
// .mapToObj(item -> (char) item)
// .collect(Collectors.toList()).stream().limit(n).collect(Collectors.toList()));
return r;
    }
public static void main(String[] args) {
    long n = 10;
    // long n = 685118368975L;
    String s = "aba";
    // String s = "ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt";

    long result = repeatedString(s, n);
System.out.println(result);
}

}