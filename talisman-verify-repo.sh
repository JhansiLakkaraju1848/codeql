#!/usr/bin/env bash

_main() {
  if ! echo "/refs/heads/master $(git rev-list --max-count=1 HEAD) /refs/heads/master $(git rev-list --max-parents=0 HEAD)" | talisman -g pre-push ; then
    local RED="\033[0;31m"
    local RESET="\033[0m"
    echo
    echo -e "${RED}There are things that look like secrets in your code. If you are really sure that this unproblematic just push the next commit."
    echo -e "If the last commit really contained a secret, please invalidate it and force push to make the build green.${RESET}"
    exit 1
  fi
}

_main
