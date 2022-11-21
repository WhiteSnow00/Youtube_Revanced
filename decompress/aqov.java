import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqov extends ahcz implements aheo
{
    private static final aqov a;
    private static volatile ahev b;
    private int c;
    private aqoy d;
    private CommandOuterClass$Command e;
    private SenderStateOuterClass$SenderState f;
    private String g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aqov.class, a = new aqov());
    }
    
    private aqov() {
        this.h = 2;
        this.g = "";
    }
    
    public static aqou a() {
        return (aqou)aqov.a.createBuilder();
    }
    
    static aqov b() {
        return aqov.a;
    }
    
    public static void c(final aqov aqov, final aqoy aqoy) {
        aqov.g(aqoy);
    }
    
    public static void d(final aqov aqov, final CommandOuterClass$Command commandOuterClass$Command) {
        aqov.f(commandOuterClass$Command);
    }
    
    public static void e(final aqov aqov, final SenderStateOuterClass$SenderState senderStateOuterClass$SenderState) {
        aqov.h(senderStateOuterClass$SenderState);
    }
    
    private void f(final CommandOuterClass$Command e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void g(final aqoy d) {
        this.d = d;
        this.c |= 0x1;
    }
    
    private void h(final SenderStateOuterClass$SenderState f) {
        f.getClass();
        this.f = f;
        this.c |= 0x4;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqov.b) == null) {
                    synchronized (aqov.class) {
                        if (aqov.b == null) {
                            aqov.b = (ahev)new ahcs((ahcz)aqov.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqov.a;
            }
            case 4: {
                return new aqou();
            }
            case 3: {
                return new aqov();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqov.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
