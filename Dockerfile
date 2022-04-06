FROM aerokube/selenoid:latest-release
COPY browsers.json /etc/selenoid/
ENTRYPOINT ["/usr/bin/selenoid", "-listen", "-conf", "/etc/selenoid/browsers.json", "-container-network", "selenoid", "-log-output-dir", "/opt-selenoid/logs"]