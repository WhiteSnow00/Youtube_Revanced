import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annv extends ahbh implements ahcw
{
    public static final annv a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public String e;
    public aoef f;
    
    static {
        final annv a2 = new annv();
        ahbh.registerDefaultInstance((Class)annv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 406356192, ahek.k, (Class)annv.class);
    }
    
    private annv() {
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
                final ahdd g;
                if ((g = annv.g) == null) {
                    synchronized (annv.class) {
                        if (annv.g == null) {
                            annv.g = (ahdd)new ahba((ahbh)annv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return annv.a;
            }
            case 4: {
                return new ahaz((ahbh)annv.a);
            }
            case 3: {
                return new annv();
            }
            case 2: {
                return newMessageInfo((MessageLite)annv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
