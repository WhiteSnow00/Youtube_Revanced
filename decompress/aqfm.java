import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfm extends ahbh implements ahcw
{
    public static final aqfm a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public float d;
    public CommandOuterClass$Command e;
    private byte g;
    
    static {
        final aqfm a2 = new aqfm();
        ahbh.registerDefaultInstance((Class)aqfm.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 182590845, ahek.k, (Class)aqfm.class);
    }
    
    private aqfm() {
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
                if ((f = aqfm.f) == null) {
                    synchronized (aqfm.class) {
                        if (aqfm.f == null) {
                            aqfm.f = (ahdd)new ahba((ahbh)aqfm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqfm.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfm.a);
            }
            case 3: {
                return new aqfm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1001\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
