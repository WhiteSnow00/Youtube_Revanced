import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovd extends ahbh implements ahcw
{
    public static final aovd a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public akbo d;
    private byte f;
    
    static {
        final aovd a2 = new aovd();
        ahbh.registerDefaultInstance((Class)aovd.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 249145766, ahek.k, (Class)aovd.class);
    }
    
    private aovd() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aovd.e) == null) {
                    synchronized (aovd.class) {
                        if (aovd.e == null) {
                            aovd.e = (ahdd)new ahba((ahbh)aovd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aovd.a;
            }
            case 4: {
                return new ahaz((ahbh)aovd.a);
            }
            case 3: {
                return new aovd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
