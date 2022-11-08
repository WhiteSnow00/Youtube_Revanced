import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpo extends agzi implements ahax
{
    public static final ajpo a;
    private static volatile ahbe g;
    public agzy b;
    public apqx c;
    public String d;
    public int e;
    public String f;
    private int h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ajpo.class, (agzi)(a = new ajpo()));
    }
    
    private ajpo() {
        this.i = 2;
        this.b = agzi.emptyProtobufList();
        this.d = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ajpo.g) == null) {
                    synchronized (ajpo.class) {
                        if (ajpo.g == null) {
                            ajpo.g = (ahbe)new agzb((agzi)ajpo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajpo.a;
            }
            case 4: {
                return new agza((agzi)ajpo.a);
            }
            case 3: {
                return new ajpo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpo.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001a\u0002\u1009\u0000\u0003\u1008\u0001\u0004\u100c\u0002\u0005\u1008\u0003", new Object[] { "h", "b", "c", "d", "e", ajoa.o, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
