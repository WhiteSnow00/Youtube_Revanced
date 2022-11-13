import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeo extends ahbh implements ahcw
{
    public static final ajeo a;
    public static final ahbf b;
    private static volatile ahdd n;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public aqfw h;
    public CommandOuterClass$Command i;
    public CommandOuterClass$Command j;
    public boolean k;
    public ajmm l;
    public int m;
    private byte o;
    
    static {
        final ajeo a2 = new ajeo();
        ahbh.registerDefaultInstance((Class)ajeo.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 183321338, ahek.k, (Class)ajeo.class);
    }
    
    private ajeo() {
        this.o = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = ajeo.n) == null) {
                    synchronized (ajeo.class) {
                        if (ajeo.n == null) {
                            ajeo.n = (ahdd)new ahba((ahbh)ajeo.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajeo.a;
            }
            case 4: {
                return new ahaz((ahbh)ajeo.a);
            }
            case 3: {
                return new ajeo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajeo.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0004\t\u1007\b\n\u1409\t\u000b\u100c\n", new Object[] { "c", "d", "e", "f", "g", "i", "j", "h", "k", "l", "m", ajek.c });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
