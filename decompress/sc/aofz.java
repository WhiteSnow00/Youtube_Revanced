import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aofz extends ahbh implements ahcw
{
    public static final aofz a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public aqfw d;
    public akbo e;
    public String f;
    private byte h;
    
    static {
        final aofz a2 = new aofz();
        ahbh.registerDefaultInstance((Class)aofz.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 427222820, ahek.k, (Class)aofz.class);
    }
    
    private aofz() {
        this.h = 2;
        this.f = "";
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
                if ((g = aofz.g) == null) {
                    synchronized (aofz.class) {
                        if (aofz.g == null) {
                            aofz.g = (ahdd)new ahba((ahbh)aofz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aofz.a;
            }
            case 4: {
                return new ahaz((ahbh)aofz.a);
            }
            case 3: {
                return new aofz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aofz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
