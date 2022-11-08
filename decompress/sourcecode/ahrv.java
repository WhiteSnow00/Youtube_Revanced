import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrv extends agzi implements ahax
{
    public static final ahrv a;
    private static volatile ahbe v;
    public int b;
    public int c;
    public Object d;
    public ahrq e;
    public aioe f;
    public aioe g;
    public aioe h;
    public aioe i;
    public aioe j;
    public agzy k;
    public agzy l;
    public agzy m;
    public agzt n;
    public ahij o;
    public int p;
    public apbm q;
    public int r;
    public anss s;
    public ampg t;
    public alts u;
    private byte w;
    
    static {
        agzi.registerDefaultInstance(ahrv.class, a = new ahrv());
    }
    
    private ahrv() {
        this.c = 0;
        this.w = 2;
        this.k = agzi.emptyProtobufList();
        this.l = agzi.emptyProtobufList();
        this.m = agzi.emptyProtobufList();
        this.n = agzi.emptyLongList();
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
                final ahbe v;
                if ((v = ahrv.v) == null) {
                    synchronized (ahrv.class) {
                        if (ahrv.v == null) {
                            ahrv.v = (ahbe)new agzb((agzi)ahrv.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return ahrv.a;
            }
            case 4: {
                return new agza((agzi)ahrv.a);
            }
            case 3: {
                return new ahrv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrv.a, "\u0001\u0013\u0001\u0001\u0001\u03e7\u0013\u0000\u0004\u000e\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u041b\u0006\u041b\b\u0014\n\u1409\u0006\u0011\u143c\u0000\u0012\u100c\n\u0016\u1409\u0005\u0018\u1009\u000b\u001a\u1004\f\u001b\u1409\u0002\u001c\u041b\u001d\u1409\r!\u1009\u000f\"\u143c\u0000\u03e7\u1409\u0010", new Object[] { "d", "c", "b", "e", "f", "h", "i", "k", ahrt.class, "l", aioe.class, "n", "o", ahrr.class, "p", ahrs.a(), "j", "q", "r", "g", "m", aioe.class, "s", "t", ahru.class, "u" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.w = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
