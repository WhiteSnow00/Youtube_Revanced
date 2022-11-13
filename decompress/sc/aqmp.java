import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmp extends ahbh implements ahcw
{
    public static final aqmp a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    private byte g;
    
    static {
        final aqmp a2 = new aqmp();
        ahbh.registerDefaultInstance((Class)aqmp.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 323854738, ahek.k, (Class)aqmp.class);
    }
    
    private aqmp() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqmp.f) == null) {
                    synchronized (aqmp.class) {
                        if (aqmp.f == null) {
                            aqmp.f = (ahdd)new ahba((ahbh)aqmp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqmp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmp.a);
            }
            case 3: {
                return new aqmp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
