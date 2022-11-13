import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anck extends ahbh implements ahcw
{
    public static final anck a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    private CommandOuterClass$Command g;
    private byte h;
    
    static {
        final anck a2 = new anck();
        ahbh.registerDefaultInstance((Class)anck.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 347675936, ahek.k, (Class)anck.class);
    }
    
    private anck() {
        this.h = 2;
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
                final ahdd f;
                if ((f = anck.f) == null) {
                    synchronized (anck.class) {
                        if (anck.f == null) {
                            anck.f = (ahdd)new ahba((ahbh)anck.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anck.a;
            }
            case 4: {
                return new ahaz((ahbh)anck.a);
            }
            case 3: {
                return new anck();
            }
            case 2: {
                return newMessageInfo((MessageLite)anck.a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0003\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "g" });
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
