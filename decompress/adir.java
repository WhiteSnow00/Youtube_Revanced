import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

class adir
{
    final Pattern a;
    final String b;
    
    public adir(final Pattern a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public String a(String group) {
        final Matcher matcher = this.a.matcher(group);
        if (matcher.find() && matcher.groupCount() == 2) {
            group = matcher.group(1);
            final String group2 = matcher.group(2);
            final String b = this.b;
            final String replace = group2.replace("/", "-");
            final StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append("-");
            sb.append(group);
            sb.append("-");
            sb.append(replace);
            return sb.toString();
        }
        return null;
    }
}
