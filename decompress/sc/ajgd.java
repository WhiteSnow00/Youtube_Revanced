import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgd extends ahbh implements ahcw
{
    public static final ajgd a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public aqfl d;
    public ajga e;
    public ajge f;
    public String g;
    public ajfy h;
    public ajgb i;
    private CommandOuterClass$Command k;
    private aqei l;
    private ahhu m;
    private byte n;
    
    static {
        final ajgd a2 = new ajgd();
        ahbh.registerDefaultInstance((Class)ajgd.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 355246692, ahek.k, (Class)ajgd.class);
    }
    
    private ajgd() {
        this.n = 2;
        emptyProtobufList();
        emptyProtobufList();
        this.g = "";
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ajgd.j) == null) {
                    synchronized (ajgd.class) {
                        if (ajgd.j == null) {
                            ajgd.j = (ahdd)new ahba((ahbh)ajgd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajgd.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgd.a);
            }
            case 3: {
                return new ajgd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgd.a, "\u0001\t\u0000\u0001\u0003%\t\u0000\u0000\u0004\u0003\u1008\u0012\u0006\u1409\u0007\u000f\u1009\u000b\u0011\u1009\u0011\u0018\u1409\n \u1009\f#\u1009\u001d$\u1409\u001e%\u1409\u001f", new Object[] { "c", "g", "k", "e", "f", "d", "l", "h", "i", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
