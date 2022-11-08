import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorm extends agzd implements agze
{
    public static final aorm a;
    private static volatile ahbe k;
    public int b;
    public agzy c;
    public ahgn d;
    public aorj e;
    public boolean f;
    public aork g;
    public allu h;
    public allu i;
    public String j;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(aorm.class, (agzi)(a = new aorm()));
    }
    
    private aorm() {
        this.m = 2;
        this.c = emptyProtobufList();
        final agyc b = agyc.b;
        this.j = "";
    }
    
    public final void a() {
        final agzy c = this.c;
        if (!c.c()) {
            this.c = agzi.mutableCopy(c);
        }
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
                if ((k = aorm.k) == null) {
                    synchronized (aorm.class) {
                        if (aorm.k == null) {
                            aorm.k = (ahbe)new agzb((agzi)aorm.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aorm.a;
            }
            case 4: {
                return new agzc((agzd)aorm.a);
            }
            case 3: {
                return new aorm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aorm.a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0001\u0000\u0001\u001b\u0004\u1009\u0003\u0007\u1009\u0006\u000b\u1007\b\f\u1009\t\r\u1009\n\u000e\u1009\u000b\u000f\u1008\f", new Object[] { "b", "c", aorl.class, "d", "e", "f", "g", "h", "i", "j" });
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
