import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmo extends agzi implements ahax
{
    public static final akmo a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public agzy d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akmo.class, a = new akmo());
    }
    
    private akmo() {
        this.g = 2;
        this.d = agzi.emptyProtobufList();
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
                if ((f = akmo.f) == null) {
                    synchronized (akmo.class) {
                        if (akmo.f == null) {
                            akmo.f = (ahbe)new agzb((agzi)akmo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akmo.a;
            }
            case 4: {
                return new agza((byte[])null, (char[])null);
            }
            case 3: {
                return new akmo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmo.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u100c\u0001", new Object[] { "b", "c", "d", ahus.class, "e", ajrv.u });
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
