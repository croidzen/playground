# NMAP
## ping for network devices
nmap -sn 192.168.0.0/24

## Portscan
nmap <url>
nmap 192.168.0.1-10
nmap 192.168.0.1/13
nmap –p 80 192.168.0.1
nmap –p 1-200 192.168.0.1
nmap –F 192.168.0.1  # Scan (Fast) the most common ports
nmap –p– 192.168.0.1  # scan all ports (1 – 65535)

# Find process listening on port
netstat -anv | grep <port>  # gets the PID
ps -A | grep <pid>

# Kill a process
kill <pid>
pkill <pname>

