import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akni extends agzi implements ahax
{
    public static final akni a;
    private static volatile ahbe j;
    public int b;
    public akjd c;
    public agzy d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(akni.class, a = new akni());
    }
    
    private akni() {
        this.k = 2;
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
                final ahbe j;
                if ((j = akni.j) == null) {
                    synchronized (akni.class) {
                        if (akni.j == null) {
                            akni.j = (ahbe)new agzb((agzi)akni.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akni.a;
            }
            case 4: {
                return new agza((short[][])null, (float[])null);
            }
            case 3: {
                return new akni();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akni.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1007\n\u0003\u1007\u000b\u0004\u001a\u0005\u1007\u0002\u0006\u1007\u0003\u0007\u1007\u0004", new Object[] { "b", "c", "h", "i", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
