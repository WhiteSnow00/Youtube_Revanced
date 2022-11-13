import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class adhd extends adhc
{
    public adhd(final Pattern pattern, final String s) {
        super(pattern, s);
    }
    
    public final String a(String s) {
        if (!this.a.matcher(s).find()) {
            return null;
        }
        final boolean contains = s.contains("owc=yes");
        final boolean contains2 = s.contains("itag=0");
        if (contains) {
            String s2;
            if (contains2) {
                s = this.b;
                s2 = "-prewarm-itag0";
            }
            else {
                s = this.b;
                s2 = "-prewarm";
            }
            return s.concat(s2);
        }
        return this.b;
    }
}
