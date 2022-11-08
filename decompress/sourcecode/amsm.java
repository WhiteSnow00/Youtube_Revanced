import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsm extends agzi implements ahax
{
    public static final amsm a;
    private static volatile ahbe m;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public amsn i;
    public agzy j;
    public long k;
    public long l;
    
    static {
        agzi.registerDefaultInstance(amsm.class, a = new amsm());
    }
    
    private amsm() {
        this.d = "";
        this.j = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = amsm.m) == null) {
                    synchronized (amsm.class) {
                        if (amsm.m == null) {
                            amsm.m = (ahbe)new agzb((agzi)amsm.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amsm.a;
            }
            case 4: {
                return new agza((boolean[])null, (short[][])null);
            }
            case 3: {
                return new amsm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsm.a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u100c\u0003\u0003\u1007\u0005\u0004\u1009\u0006\u0005\u001b\u0006\u100c\u0002\u0007\u1008\u0001\b\u1002\u0007\t\u1002\b\n\u100c\u0004", new Object[] { "b", "c", "f", amsc.g, "h", "i", "j", amsn.class, "e", amsc.h, "d", "k", "l", "g", amsc.i });
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
