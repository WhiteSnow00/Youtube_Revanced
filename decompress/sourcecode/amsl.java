import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsl extends agzi implements ahax
{
    public static final amsl a;
    private static volatile ahbe n;
    public int b;
    public int c;
    public Object d;
    public String e;
    public amsh f;
    public String g;
    public String h;
    public agzy i;
    public String j;
    public agzy k;
    public int l;
    public boolean m;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(amsl.class, a = new amsl());
    }
    
    private amsl() {
        this.c = 0;
        this.o = 2;
        this.e = "";
        this.g = "";
        this.h = "";
        this.i = agzi.emptyProtobufList();
        this.j = "";
        this.k = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe n;
                if ((n = amsl.n) == null) {
                    synchronized (amsl.class) {
                        if (amsl.n == null) {
                            amsl.n = (ahbe)new agzb((agzi)amsl.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return amsl.a;
            }
            case 4: {
                return new agza((boolean[][])null, (float[])null);
            }
            case 3: {
                return new amsl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsl.a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1035\u0000\u0004\u1008\u0004\u0005\u1008\u0005\u0006\u001a\u0007\u1008\u0006\b\u001a\t\u1004\u0007\n\u1007\b\u000b\u1035\u0000", new Object[] { "d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
