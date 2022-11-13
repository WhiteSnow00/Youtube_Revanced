import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anoh extends ahbh implements ahcw
{
    public static final anoh a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public int e;
    
    static {
        final anoh a2 = new anoh();
        ahbh.registerDefaultInstance((Class)anoh.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 314223858, ahek.k, (Class)anoh.class);
    }
    
    private anoh() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anoh.f) == null) {
                    synchronized (anoh.class) {
                        if (anoh.f == null) {
                            anoh.f = (ahdd)new ahba((ahbh)anoh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anoh.a;
            }
            case 4: {
                return new ahaz((ahbh)anoh.a);
            }
            case 3: {
                return new anoh();
            }
            case 2: {
                return newMessageInfo((MessageLite)anoh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
