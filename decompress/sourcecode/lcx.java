import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcx implements acpb
{
    private final /* synthetic */ int a;
    
    public lcx(final int a) {
        this.a = a;
    }
    
    public static boolean d(final Object o) {
        return o instanceof aogh || o instanceof aijg;
    }
    
    @Override
    public final aext e() {
        final int a = this.a;
        if (a == 0) {
            return (aext)kcf.j;
        }
        if (a == 1) {
            return (aext)bbt.d;
        }
        if (a != 2) {
            return (aext)kcf.m;
        }
        return (aext)aexv.d;
    }
}
