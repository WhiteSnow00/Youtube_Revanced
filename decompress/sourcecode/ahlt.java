import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlt extends agzi implements ahax
{
    public static final ahlt a;
    private static volatile ahbe k;
    public int b;
    public agzy c;
    public float d;
    public anss e;
    public int f;
    public boolean g;
    public ahlu h;
    public ahjr i;
    public ahjt j;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)ahlt.class, (agzi)(a = new ahlt()));
    }
    
    private ahlt() {
        this.m = 2;
        this.c = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe k;
                if ((k = ahlt.k) == null) {
                    synchronized (ahlt.class) {
                        if (ahlt.k == null) {
                            ahlt.k = (ahbe)new agzb((agzi)ahlt.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ahlt.a;
            }
            case 4: {
                return new agza((int[])null, (float[])null);
            }
            case 3: {
                return new ahlt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlt.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0004\u0001\u041b\u0002\u1409\u0000\u0004\u1001\u0002\u0005\u1409\u0003\u0006\u100c\u0004\u0007\u1007\u0005\b\u1409\u0006\t\u1009\u0007\n\u1009\b", new Object[] { "b", "c", ahlv.class, "l", "d", "e", "f", ahho.k, "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
