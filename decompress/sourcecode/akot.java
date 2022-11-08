import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akot extends agzi implements ahax
{
    public static final akot a;
    private static volatile ahbe j;
    public int b;
    public akjd c;
    public apjb d;
    public agzq e;
    public int f;
    public akov g;
    public agzq h;
    public aocu i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(akot.class, a = new akot());
    }
    
    private akot() {
        this.k = 2;
        this.e = agzi.emptyIntList();
        this.h = agzi.emptyIntList();
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
                if ((j = akot.j) == null) {
                    synchronized (akot.class) {
                        if (akot.j == null) {
                            akot.j = (ahbe)new agzb((agzi)akot.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akot.a;
            }
            case 4: {
                return new agza((short[])null, (short[][])null);
            }
            case 3: {
                return new akot();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akot.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u001e\u0004\u100c\u0002\u0005\u1009\u0003\u0006,\u0007\u1009\u0004", new Object[] { "b", "c", "d", "e", apms.c, "f", aocr.f, "g", "h", aocr.g, "i" });
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
