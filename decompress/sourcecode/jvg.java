import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvg extends aclr
{
    private final acjb a;
    
    public jvg(final acno acno, final acae acae, final ajkj ajkj) {
        acno.b((Class)ajkj.class);
        final afcr r = afcr.r((Object)ajkj);
        final aeim aeim = new aeim((byte[])null, (short[])null);
        aeim.I((acpb)acae);
        (this.a = new acjb()).add(aeim.H((List)r).get(0));
    }
    
    public final achk a() {
        return (achk)this.a;
    }
}
