import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annu extends ahbh implements ahcw
{
    public static final annu a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public String e;
    
    static {
        final annu a2 = new annu();
        ahbh.registerDefaultInstance((Class)annu.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 473072685, ahek.k, (Class)annu.class);
    }
    
    private annu() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = annu.f) == null) {
                    synchronized (annu.class) {
                        if (annu.f == null) {
                            annu.f = (ahdd)new ahba((ahbh)annu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return annu.a;
            }
            case 4: {
                return new ahaz((ahbh)annu.a);
            }
            case 3: {
                return new annu();
            }
            case 2: {
                return newMessageInfo((MessageLite)annu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
