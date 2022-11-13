import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmc extends ahbh implements ahcw
{
    private static final aqmc a;
    private static volatile ahdd b;
    private int c;
    private aqmf d;
    private CommandOuterClass$Command e;
    private SenderStateOuterClass$SenderState f;
    private String g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmc.class, (ahbh)(a = new aqmc()));
    }
    
    private aqmc() {
        this.h = 2;
        this.g = "";
    }
    
    public static aqmb a() {
        return (aqmb)aqmc.a.createBuilder();
    }
    
    static aqmc b() {
        return aqmc.a;
    }
    
    public static void c(final aqmc aqmc, final aqmf aqmf) {
        aqmc.g(aqmf);
    }
    
    public static void d(final aqmc aqmc, final CommandOuterClass$Command commandOuterClass$Command) {
        aqmc.f(commandOuterClass$Command);
    }
    
    public static void e(final aqmc aqmc, final SenderStateOuterClass$SenderState senderStateOuterClass$SenderState) {
        aqmc.h(senderStateOuterClass$SenderState);
    }
    
    private void f(final CommandOuterClass$Command e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void g(final aqmf d) {
        this.d = d;
        this.c |= 0x1;
    }
    
    private void h(final SenderStateOuterClass$SenderState f) {
        f.getClass();
        this.f = f;
        this.c |= 0x4;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqmc.b) == null) {
                    synchronized (aqmc.class) {
                        if (aqmc.b == null) {
                            aqmc.b = (ahdd)new ahba((ahbh)aqmc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqmc.a;
            }
            case 4: {
                return new aqmb();
            }
            case 3: {
                return new aqmc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
