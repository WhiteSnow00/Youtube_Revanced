import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtg extends agzi implements ahax
{
    public static final ahtg a;
    private static volatile ahbe j;
    public int b;
    public String c;
    public long d;
    public agzy e;
    public agzy f;
    public agzy g;
    public agyc h;
    public aioe i;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(ahtg.class, a = new ahtg());
    }
    
    private ahtg() {
        this.l = 2;
        this.c = "";
        emptyProtobufList();
        emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
        this.h = agyc.b;
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
                if ((j = ahtg.j) == null) {
                    synchronized (ahtg.class) {
                        if (ahtg.j == null) {
                            ahtg.j = (ahbe)new agzb((agzi)ahtg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahtg.a;
            }
            case 4: {
                return new agza((agzi)ahtg.a);
            }
            case 3: {
                return new ahtg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtg.a, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0003\u0002\u0001\u1008\u0000\t\u001b\n\u001b\r\u1409\t\u000e\u100a\n\u000f\u1002\b\u0010\u001b\u0011\u1409\u000b", new Object[] { "b", "c", "e", ahky.class, "f", ahky.class, "k", "h", "d", "g", ahky.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
