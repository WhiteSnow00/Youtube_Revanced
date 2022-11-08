import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkt extends agzi implements ahax
{
    public static final apkt a;
    private static volatile ahbe b;
    private ahfw A;
    private apkr B;
    private apkv C;
    private amer D;
    private aioe E;
    private byte F;
    private int c;
    private int d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private apkw h;
    private aokl i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private ajsq m;
    private ajsq n;
    private ajsq o;
    private ajsq p;
    private apku q;
    private ajsq r;
    private ahyq s;
    private ahyq t;
    private ahyx u;
    private ally v;
    private aibi w;
    private apks x;
    private anss y;
    private anss z;
    
    static {
        agzi.registerDefaultInstance(apkt.class, a = new apkt());
    }
    
    private apkt() {
        this.F = 2;
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = apkt.b) == null) {
                    synchronized (apkt.class) {
                        if (apkt.b == null) {
                            apkt.b = (ahbe)new agzb((agzi)apkt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apkt.a;
            }
            case 4: {
                return new agza((agzi)apkt.a);
            }
            case 3: {
                return new apkt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkt.a, "\u0001\u001b\u0000\u0002\u0001/\u001b\u0000\u0000\u001b\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\n\n\u1409\f\f\u1409\u000e\u0010\u1409\u0013\u0017\u1409\u0011\u0018\u1409\u001a\u001b\u1409\u000b \u1409\"!\u1409\u0004\"\u1409#%\u1409$&\u1409%'\u1409\u001b(\u1409\u0015)\u1409\u0016*\u1409\u001c+\u1409\u0017,\u1409 .\u1409\u001d/\u1409\u001e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "o", "p", "r", "q", "v", "n", "B", "h", "C", "D", "E", "w", "s", "t", "x", "u", "A", "y", "z" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.F = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.F;
            }
        }
    }
}
