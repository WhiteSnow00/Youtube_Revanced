// 
// Decompiled by Procyon v0.6.0
// 

public final class glh
{
    public final akdd a;
    public final akec b;
    public final akdr c;
    public final akeb d;
    private final int e;
    
    public glh() {
    }
    
    public glh(final akdd a, final akec b, final akdr c, final akeb d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static glg a() {
        final glg glg = new glg();
        glg.b(akdd.a);
        glg.e(akec.a);
        glg.c(akdr.a);
        glg.d(akeb.a);
        glg.a = 1;
        return glg;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof glh) {
            final glh glh = (glh)o;
            if (this.a.equals((Object)glh.a) && this.b.equals((Object)glh.b) && this.c.equals((Object)glh.c) && this.d.equals((Object)glh.d)) {
                final int e = this.e;
                final int e2 = glh.e;
                if (e == 0) {
                    throw null;
                }
                if (e == e2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final int e = this.e;
        if (e != 0) {
            return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ e;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final int e = this.e;
        String string;
        if (e != 0) {
            string = Integer.toString(e - 1);
        }
        else {
            string = "null";
        }
        final StringBuilder sb = new StringBuilder("InlinePlaybackControlsConfig{inlineAudioControlUIStyle=");
        sb.append(value);
        sb.append(", inlineScrubbingUIStyle=");
        sb.append(value2);
        sb.append(", inlinePlaybackFullScreenUIStyle=");
        sb.append(value3);
        sb.append(", inlinePlaybackTriggerStyle=");
        sb.append(value4);
        sb.append(", inlinePlaybackHostContainerStyle=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
