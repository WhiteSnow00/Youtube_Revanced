import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apju extends agzi implements ahax
{
    public static final apju a;
    private static volatile ahbe n;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private int o;
    private int p;
    
    static {
        agzi.registerDefaultInstance(apju.class, a = new apju());
    }
    
    private apju() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe n;
                if ((n = apju.n) == null) {
                    synchronized (apju.class) {
                        if (apju.n == null) {
                            apju.n = (ahbe)new agzb((agzi)apju.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return apju.a;
            }
            case 4: {
                return new agza((agzi)apju.a);
            }
            case 3: {
                return new apju();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apju.a, "\u0001\f\u0000\u0002\u0005.\f\u0000\u0000\u0000\u0005\u1007\u0004\t\u1007\b\n\u1007\t\u0012\u1007\u0011\u001c\u1007\u001b\u001d\u100c\u001c\u001f\u1007\u001e \u1007\u001f$\u1007#'\u1007&)\u1007(.\u1007-", new Object[] { "o", "p", "b", "c", "d", "e", "f", "g", apjd.d, "h", "i", "j", "k", "l", "m" });
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
