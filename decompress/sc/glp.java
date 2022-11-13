// 
// Decompiled by Procyon v0.6.0
// 

public final class glp
{
    public final akfg a;
    public final akgf b;
    public final akfu c;
    public final akge d;
    private final int e;
    
    public glp() {
    }
    
    public glp(final akfg a, final akgf b, final akfu c, final akge d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static glo a() {
        final glo glo = new glo();
        glo.b(akfg.a);
        glo.e(akgf.a);
        glo.c(akfu.a);
        glo.d(akge.a);
        glo.a = 1;
        return glo;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof glp) {
            final glp glp = (glp)o;
            if (this.a.equals(glp.a) && this.b.equals(glp.b) && this.c.equals(glp.c) && this.d.equals(glp.d)) {
                final int e = this.e;
                final int e2 = glp.e;
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
