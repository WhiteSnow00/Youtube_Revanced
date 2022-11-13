import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfe extends ahbh implements ahcw
{
    public static final ajfe a;
    public static final ahbf b;
    private static volatile ahdd d;
    public ahbx c;
    private int e;
    private aiqj f;
    private byte g;
    
    static {
        final ajfe a2 = new ajfe();
        ahbh.registerDefaultInstance((Class)ajfe.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 167732284, ahek.k, (Class)ajfe.class);
    }
    
    private ajfe() {
        this.g = 2;
        emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajfe.d) == null) {
                    synchronized (ajfe.class) {
                        if (ajfe.d == null) {
                            ajfe.d = (ahdd)new ahba((ahbh)ajfe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajfe.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfe.a);
            }
            case 3: {
                return new ajfe();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfe.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0003\u041b", new Object[] { "e", "f", "c", aiqj.class });
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
