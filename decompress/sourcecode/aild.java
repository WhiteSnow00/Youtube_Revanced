import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aild extends agzi implements ahax
{
    public static final aild a;
    private static volatile ahbe s;
    public int b;
    public ailj c;
    public ailk d;
    public ailv e;
    public ailg f;
    public ailw g;
    public ailh h;
    public aile i;
    public aimf j;
    public ailq k;
    public aime l;
    public aily m;
    public ailz n;
    public aimd o;
    public aimc p;
    public ailo q;
    public ailn r;
    
    static {
        agzi.registerDefaultInstance(aild.class, a = new aild());
    }
    
    private aild() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe s;
                if ((s = aild.s) == null) {
                    synchronized (aild.class) {
                        if (aild.s == null) {
                            aild.s = (ahbe)new agzb((agzi)aild.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aild.a;
            }
            case 4: {
                return new agza((agzi)aild.a);
            }
            case 3: {
                return new aild();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aild.a, "\u0001\u0010\u0000\u0001\u0002b\u0010\u0000\u0000\u0000\u0002\u1009\u0000\u0005\u1009\u0001\u0006\u1009\u0002\u0014\u1009\u0003\u0015\u1009\u0004 \u1009\u0005)\u1009\u0006;\u1009\u0007?\u1009\b@\u1009\tM\u1009\nS\u1009\u000bU\u1009\f\\\u1009\r`\u1009\u000eb\u1009\u000f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r" });
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
