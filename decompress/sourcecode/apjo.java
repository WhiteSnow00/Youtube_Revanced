import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjo extends agzi implements ahax
{
    public static final apjo a;
    private static volatile ahbe i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public agzy h;
    
    static {
        agzi.registerDefaultInstance(apjo.class, a = new apjo());
    }
    
    private apjo() {
        this.h = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = apjo.i) == null) {
                    synchronized (apjo.class) {
                        if (apjo.i == null) {
                            apjo.i = (ahbe)new agzb((agzi)apjo.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apjo.a;
            }
            case 4: {
                return new agza((short[])null, (float[][])null);
            }
            case 3: {
                return new apjo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjo.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u001b", new Object[] { "b", "c", "d", "e", "f", apjh.a(), "g", apjg.a(), "h", apjl.class });
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
