import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annz extends ahbh implements ahcw
{
    public static final annz a;
    public static final ahbf b;
    private static volatile ahdd i;
    public String c;
    public String d;
    public int e;
    public String f;
    public int g;
    public ahbx h;
    private int j;
    
    static {
        final annz a2 = new annz();
        ahbh.registerDefaultInstance((Class)annz.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 406356191, ahek.k, (Class)annz.class);
    }
    
    private annz() {
        this.c = "";
        this.d = "";
        this.f = "";
        this.h = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = annz.i) == null) {
                    synchronized (annz.class) {
                        if (annz.i == null) {
                            annz.i = (ahdd)new ahba((ahbh)annz.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return annz.a;
            }
            case 4: {
                return new ahaz((ahbh)annz.a);
            }
            case 3: {
                return new annz();
            }
            case 2: {
                return newMessageInfo((MessageLite)annz.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0006\u001b", new Object[] { "j", "c", "d", "e", ajmw.f, "f", "g", anic.o, "h", annx.class });
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
