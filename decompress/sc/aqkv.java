import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkv extends ahbh implements ahcw
{
    public static final aqkv a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public float e;
    public CommandOuterClass$Command f;
    private byte h;
    
    static {
        final aqkv a2 = new aqkv();
        ahbh.registerDefaultInstance((Class)aqkv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 455760581, ahek.k, (Class)aqkv.class);
    }
    
    private aqkv() {
        this.h = 2;
        this.d = "";
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
                final ahdd g;
                if ((g = aqkv.g) == null) {
                    synchronized (aqkv.class) {
                        if (aqkv.g == null) {
                            aqkv.g = (ahdd)new ahba((ahbh)aqkv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqkv.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkv.a);
            }
            case 3: {
                return new aqkv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkv.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1001\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
