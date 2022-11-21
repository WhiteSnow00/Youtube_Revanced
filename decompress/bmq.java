// 
// Decompiled by Procyon v0.6.0
// 

final class bmq implements bmr
{
    public bmq() {
    }
    
    @Override
    public final bvh a(final ayh ayh) {
        final String n = ayh.n;
        if (n != null) {
            int n2 = 0;
            Label_0139: {
                switch (n.hashCode()) {
                    case 1652648887: {
                        if (n.equals("application/x-scte35")) {
                            n2 = 2;
                            break Label_0139;
                        }
                        break;
                    }
                    case 1154383568: {
                        if (n.equals("application/x-emsg")) {
                            n2 = 1;
                            break Label_0139;
                        }
                        break;
                    }
                    case -1248341703: {
                        if (n.equals("application/id3")) {
                            n2 = 0;
                            break Label_0139;
                        }
                        break;
                    }
                    case -1348231605: {
                        if (n.equals("application/x-icy")) {
                            n2 = 3;
                            break Label_0139;
                        }
                        break;
                    }
                    case -1354451219: {
                        if (n.equals("application/vnd.dvb.ait")) {
                            n2 = 4;
                            break Label_0139;
                        }
                        break;
                    }
                }
                n2 = -1;
            }
            if (n2 == 0) {
                return (bvh)new bvo((bvn)null);
            }
            if (n2 == 1) {
                return (bvh)new bvl();
            }
            if (n2 == 2) {
                return (bvh)new bvq();
            }
            if (n2 == 3) {
                return (bvh)new bvm();
            }
            if (n2 == 4) {
                return (bvh)new bvk();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(n)));
    }
    
    @Override
    public final boolean b(final ayh ayh) {
        final String n = ayh.n;
        return "application/id3".equals(n) || "application/x-emsg".equals(n) || "application/x-scte35".equals(n) || "application/x-icy".equals(n) || "application/vnd.dvb.ait".equals(n);
    }
}
