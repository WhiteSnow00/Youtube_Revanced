import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alat extends agzi implements ahax
{
    public static final alat a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public agzy d;
    public agzy e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)alat.class, (agzi)(a = new alat()));
    }
    
    private alat() {
        this.g = 2;
        this.d = emptyProtobufList();
        this.e = agzi.emptyProtobufList();
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
                final ahbe f;
                if ((f = alat.f) == null) {
                    synchronized (alat.class) {
                        if (alat.f == null) {
                            alat.f = (ahbe)new agzb((agzi)alat.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alat.a;
            }
            case 4: {
                return new agza((int[][][])null, (short[])null);
            }
            case 3: {
                return new alat();
            }
            case 2: {
                return newMessageInfo((MessageLite)alat.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u001a", new Object[] { "b", "c", "d", apft.class, "e" });
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
