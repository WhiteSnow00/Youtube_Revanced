import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqeo extends ahbh implements ahcw
{
    public static final aqeo a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int g;
    public String h;
    public aqem i;
    
    static {
        final aqeo a2 = new aqeo();
        ahbh.registerDefaultInstance((Class)aqeo.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 281539545, ahek.k, (Class)aqeo.class);
    }
    
    private aqeo() {
        this.f = true;
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = aqeo.j) == null) {
                    synchronized (aqeo.class) {
                        if (aqeo.j == null) {
                            aqeo.j = (ahdd)new ahba((ahbh)aqeo.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqeo.a;
            }
            case 4: {
                return new ahaz((ahbh)aqeo.a);
            }
            case 3: {
                return new aqeo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqeo.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0003\u1007\u0002\u0004\u100c\u0003\u0005\u1008\u0004\u0006\u1009\u0005", new Object[] { "c", "d", "e", "f", "g", aqcl.j, "h", "i" });
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
