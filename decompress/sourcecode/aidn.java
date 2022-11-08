import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidn extends agzi implements ahax
{
    public static final aidn a;
    private static volatile ahbe b;
    private ajsq A;
    private ajsq B;
    private aidt C;
    private aioe D;
    private ajsq E;
    private byte F;
    private int c;
    private int d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private aidu m;
    private ajsq n;
    private ajsq o;
    private ajsq p;
    private ajsq q;
    private ajsq r;
    private ajsq s;
    private aidx t;
    private aidv u;
    private aidw v;
    private aidr w;
    private aioe x;
    private ajsq y;
    private aido z;
    
    static {
        agzi.registerDefaultInstance((Class)aidn.class, (agzi)(a = new aidn()));
    }
    
    private aidn() {
        this.F = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = aidn.b) == null) {
                    synchronized (aidn.class) {
                        if (aidn.b == null) {
                            aidn.b = (ahbe)new agzb((agzi)aidn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidn.a;
            }
            case 4: {
                return new agza((agzi)aidn.a);
            }
            case 3: {
                return new aidn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidn.a, "\u0001\u001b\u0000\u0002\u0001)\u001b\u0000\u0000\u001b\u0001\u1409\u0004\u0004\u1409\u000e\u0005\u1409\u000f\u0006\u1409\u0010\u0007\u1409\u0012\b\u1409\u0013\t\u1409\u0014\n\u1409\u0015\f\u1409\u0016\u0012\u1409\u001f\u0013\u1409\u0000\u0015\u1409\n\u0016\u1409\u000b\u0018\u1409\u001b\u0019\u1409\u001c\u001a\u1409\u0003\u001b\u1409\u0018\u001c\u1409\f\u001d\u1409\r\u001e\u1409\t\u001f\u1409\u0006 \u1409\u0005%\u1409\u0007&\u1409\u001d'\u1409 (\u1409!)\u1409\u0011", new Object[] { "c", "d", "g", "p", "q", "r", "t", "u", "v", "w", "x", "C", "e", "l", "m", "z", "A", "f", "y", "n", "o", "k", "i", "h", "j", "B", "D", "E", "s" });
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
