import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkc extends ahcu implements ahcv
{
    public static final aqkc a;
    public static final ahcx b;
    private static volatile ahev e;
    public String c;
    public aqkd d;
    private int f;
    private byte g;
    
    static {
        final aqkc a2 = new aqkc();
        ahcz.registerDefaultInstance(aqkc.class, (ahcz)(a = a2));
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 194114827, ahgc.k, aqkc.class);
    }
    
    private aqkc() {
        this.g = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqkc.e) == null) {
                    synchronized (aqkc.class) {
                        if (aqkc.e == null) {
                            aqkc.e = (ahev)new ahcs((ahcz)aqkc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqkc.a;
            }
            case 4: {
                return new ahct((ahcu)aqkc.a);
            }
            case 3: {
                return new aqkc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkc.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0001", new Object[] { "f", "c", "d" });
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
