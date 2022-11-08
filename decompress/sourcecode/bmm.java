// 
// Decompiled by Procyon v0.6.0
// 

final class bmm implements bmn
{
    public bmm() {
    }
    
    public final bvd a(final ayf ayf) {
        final String n = ayf.n;
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
                return (bvd)new bvk((bvj)null);
            }
            if (n2 == 1) {
                return (bvd)new bvh();
            }
            if (n2 == 2) {
                return (bvd)new bvm();
            }
            if (n2 == 3) {
                return (bvd)new bvi();
            }
            if (n2 == 4) {
                return (bvd)new bvg();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(n)));
    }
    
    public final boolean b(final ayf ayf) {
        final String n = ayf.n;
        return "application/id3".equals(n) || "application/x-emsg".equals(n) || "application/x-scte35".equals(n) || "application/x-icy".equals(n) || "application/vnd.dvb.ait".equals(n);
    }
}
