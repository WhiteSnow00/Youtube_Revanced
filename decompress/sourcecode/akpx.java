import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpx extends agzi implements ahax
{
    public static final akpx a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public agzy d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akpx.class, a = new akpx());
    }
    
    private akpx() {
        this.g = 2;
        this.d = agzi.emptyProtobufList();
        this.e = "";
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
                final ahbe f;
                if ((f = akpx.f) == null) {
                    synchronized (akpx.class) {
                        if (akpx.f == null) {
                            akpx.f = (ahbe)new agzb((agzi)akpx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akpx.a;
            }
            case 4: {
                return new agza((boolean[][][])null, (int[][])null);
            }
            case 3: {
                return new akpx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpx.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u1008\u0001", new Object[] { "b", "c", "d", akqb.class, "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
