import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogg extends ahbh implements ahcw
{
    public static final aogg a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public aqfw d;
    public int e;
    public int f;
    public int g;
    private byte i;
    
    static {
        final aogg a2 = new aogg();
        ahbh.registerDefaultInstance((Class)aogg.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 234871417, ahek.k, (Class)aogg.class);
    }
    
    private aogg() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aogg.h) == null) {
                    synchronized (aogg.class) {
                        if (aogg.h == null) {
                            aogg.h = (ahdd)new ahba((ahbh)aogg.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aogg.a;
            }
            case 4: {
                return new ahaz((ahbh)aogg.a);
            }
            case 3: {
                return new aogg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogg.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
